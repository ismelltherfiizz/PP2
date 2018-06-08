from routes import ma

class RecordSchema(ma.Schema):
    class Meta:
        # Fields to expose
        fields = ('artist_name', 'record_name')