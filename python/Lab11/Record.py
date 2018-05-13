from enum import Enum

class record_genre(Enum):
	ROCK = 1
	POP = 2
	CLASSIC = 3
	SOUNDTRACK = 4

class Record:
	artist_name = None
	record_name = None
	subgenre_name = None
	composer_name = None
	release_year = 0
	record_value = 0.0
	record_length = 0
	