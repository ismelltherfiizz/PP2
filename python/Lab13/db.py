from flask_restful import Api, Resource, reqparse, fields, marshal
from flask import request, abort
from Record import *    
from flask import Flask

app_lab = Flask(__name__)

record1 = Record("NIN", "Non entity")
record2 = Record("David Bowie", "Suffragette City")

my_dict = {
     '1': record1,
     '2': record2
 }
#my_dict = dict()
@app_lab.route('/musicstore/records/<id>', methods=['GET'])
def getRecord(id):
    if id in my_dict:
        return my_dict[id].__dict__.__str__()
    else:
        abort(404)


@app_lab.route('/musicstore/records', methods=['POST', 'PUT'])
def postRecord():
    req_data = request.get_json()
    #record_genre = req_data['record_genre']
    artist_name = req_data['artist_name']
    record_name = req_data['record_name']    
    id = req_data['id']
    new_record = Record(artist_name, record_name)
    my_dict[id] = new_record
    return 'post works or put works'


@app_lab.route('/musicstore/records', methods=['DELETE'])
def deleteRecord():
    req_data = request.get_json()
    id = req_data['id']
    my_dict.pop(id)
    return 'delete works'
if __name__ == '__main__':
    app_lab.run(debug=True)
