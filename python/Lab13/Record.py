from enum import Enum

class record_genre(Enum):
	ROCK = 1
	POP = 2
	CLASSIC = 3
	SOUNDTRACK = 4
        #self.record_genre = record_genre

class Record:
    def __init__(self, artist_name, record_name):
        self.artist_name = artist_name
        self.record_name = record_name

	