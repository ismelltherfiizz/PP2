from Record import *
class Audiobook(Record):
	def __init__(self,   record_genre,  artist_name,  book_author,  subgenre_name,  book_release_year,  record_name,  release_year, record_value,  record_length,  dictor_name,  book_length,  composer_name):
			self.record_genre = record_genre
			self.book_author = book_author
			self.artist_name = artist_name
			self.subgenre_name = subgenre_name
			self.book_length = book_length
			self.dictor_name = dictor_name
			self.release_year = release_year
			self.record_value = record_value
			self.record_length = record_length
			self.book_release_year = book_release_year
			self.record_name = record_name
			self.composer_name = composer_name
	