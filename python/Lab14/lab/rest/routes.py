from Record import *
from flask import request
#from RecordSchema import RecordSchema
from flask import jsonify
from flask import Flask
from flask_marshmallow import *
from flask_sqlalchemy import *


app_lab = Flask(__name__)
ma = Marshmallow(app_lab)

class RecordSchema(ma.Schema):
    class Meta:
        # Fields to expose
        fields = ('artist_name', 'record_name')

app_lab.config.from_pyfile('config.py')

db = SQLAlchemy(app_lab)
 
 
record_schema = RecordSchema()
records_schema = RecordSchema(many=True)


# GET one by id
@app_lab.route('/recordshop/records/<id>', methods=['GET'])
def get_record(id):
    record = Record.query.get(id)
    return jsonify(record_schema.dump(record))


# GET all
@app_lab.route('/recordshop/records', methods=['GET'])
def get_records():
    record = Record.query.all()
    return jsonify(record_schema.dump(record))


# POST
@app_lab.route('/recordshop/records', methods=['POST'])
def post_record():
    artist_name = request.json['artist_name']
    record_name = request.json['record_name']

    new_record = Record(artist_name, record_name)

    db.session.add(new_record)
    db.session.commit()

    return jsonify(record_schema.dump(new_record))


# PUT
@app_lab.route('/recordshop/records/<id>', methods=['PUT'])
def update_record(id):
    record = Record.query.get(id)
    artist_name = request.json['artist_name']
    record_name = request.json['record_name']

    record.artist_name = artist_name
    record.record_name = record_name

    db.session.commit()
    return jsonify(record_schema.dump(record))


# DELETE
@app_lab.route('/recordshop/records/<id>', methods=['DELETE'])
def delete_record(id):
    record = Record.query.get(id)
    db.session.delete(record)
    db.session.commit()

    return jsonify(record_schema.dump(record))

if __name__ == '__main__':
    app_lab.run(debug=True)
