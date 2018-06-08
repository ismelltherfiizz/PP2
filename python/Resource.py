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

goods_fields = {
    'id': fields.Integer,
    'record name': fields.String,
    'artist name': fields.String,
}

@app.route('/')
def index():
    return "Hello, World!"
 
if __name__ == '__main__':
    app.run(debug=True)
    