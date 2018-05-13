from Record import *
class Song(Record):
	def __init__(self,  record_genre,  artist_name,  subgenre_name,  producer_name,  record_name,  album_name,
                 release_year,  record_value,  record_length,  composition_year,  song_number,  composer_name):
				self.record_genre = record_genre
				self.artist_name = artist_name
				self.subgenre_name = subgenre_name
				self.producer_name = producer_name
				self.record_name = record_name
				self.album_name = album_name
				self.release_year = release_year
				self.record_value = record_value
				self.record_length = record_length
				self.composition_year = composition_year
				self.song_number = song_number
				self.composer_name = composer_name