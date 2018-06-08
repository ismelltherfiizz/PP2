from routes import db


class Record(db.Model):

    __tablename__ = 'records'
    id = db.Column(db.Integer, primary_key=True)
    artist_name = db.Column(db.String(20), index=True)
    record_name = db.Column(db.String(20), index=True)

    def __init__(self, artist_name, record_name):
        self.artist_name = artist_name
        self.record_name = record_name

	