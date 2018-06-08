from flask import Flask
from flask_restful import Api, Resource, reqparse, fields, marshal
from flask import request, abort

from Record import *

record1 = Record( "NIN", "Non entity")
record2 = Record("NIN", "Hurt")
my_dict = {
    '8': record1,
    '9': record2
}
