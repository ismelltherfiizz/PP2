from flask import Flask
from flask_restful import Api, Resource, reqparse, fields, marshal

app = Flask(__name__, static_url_path="")
api = Api(app)
record = [
    {
        'Id': 0,
        'record name': 'Default',
        'artist name': 'Default'
    }
]

records_fields = {
    'id': fields.Integer,
    'record name': fields.String,
    'artist name': fields.String,
}

if __name__ == '__main__':
    app.run(debug=True)
class Record(Resource):

        
    def __init__(self):
        self.reqparse = reqparse.RequestParser()
        self.reqparse.add_argument('id', type=int, required=True, help='No Id provided', location='json')
        self.reqparse.add_argument('record name', type=str, default="", location='json')
        self.reqparse.add_argument('artist name', type=str, default="", location='json')
        super(RecordsList, self).__init__() # super().__init__() / GoodsList.__init__(self)
    @app.route('/records')
    def post(self):
        args = self.reqparse.parse_args()
        record = [record for record in records if record.get('id') == args['id']]
        if len(record) == 0:
            abort(404)
        record = record[0]
        args = self.reqparse.parse_args()
        for k, v in args.items():
            if v is not None:
                record[k] = v
    @app.route('/records')
    def get(self, id):
        record = [record for record in records if record.get('id') == id]
        if len(record) == 0:
            abort(404)
        return {'Record': marshal(record[0], records_fields)}
        
    @app.route('/records')
    def put(self):
        args = self.reqparse.parse_args()
        good = {
            'Id': records[-1]['Id'] + 1,
            'id': args['id'],
            'record name': args['record name'],
            'artist name': args['artist name']
        }   
        
    @app.route('/records')
    def delete(self, id):
        record = [record for record in records if record.get('id') == id]
        if len(record) == 0:
            abort(404)
        records.remove(record[0])
        return {'result': True} 

    records.append(record)
    api.add_resource(RecordsList, '/records', endpoint='records')
    api.add_resource(Record, '/records/<int:id>', endpoint='record')
    if __name__ == '__main__':
        app.run(debug=True)



