from Record import *
from Song import *
from Audiobook import *

class Music_Store:

    records = []
    record_genre = record_genre.ROCK
    
    def __init__(self):
        pass
    
    def find_by_recording_possibility(self):
        print(record_genre, " records which you can write to CD:")
        for record in self.records:
            if record.record_length <= 600 or record.record_genre == record_genre:
                print("'" + record.record_name + "'" + " by " + "'" + record.artist_name + "'" + " (", record.record_length, " seconds);")
    
    def sort_by_composer(self):
        print("Records sorted by composer:")
        keyfun=lambda record: record.composer_name
        self.records.sort(key=keyfun)
        for record in self.records:
            print("'" + record.record_name + "'" + " by " + "'" + record.composer_name + "'" + ";")
    # def switch(self): 
        # switcher = {1: "Please type the genre", 2: "", 3: ""}
        # print (switcher.get(self, "Invalid value"))

if __name__ == '__main__':
    store = Music_Store()
    hurt = Song(record_genre.ROCK, "Nine Inch Nails", "Industrial", "Alan Moulder",
            "Hurt", "The Downward Spiral", 1994, 2.49, 375, 1993, 15, "Trent Reznor")
    ziggy = Song(record_genre.ROCK, "David Bowie", "Glam rock", "Ken Scott",
            "Ziggy Stardust", "Ziggy Stardust and the Spiders from Mars", 1973, 2, 201, 1972,
            4, "David Bowie")
    smooth_criminal = Song(record_genre.POP, "Michael Jackson", "Funk", "Quincy Jones",
            "Smooth Criminal", "Bad", 1987, 1.5, 257, 1985, 1, "Michael Jackson")
    symphony_9 = Song(record_genre.CLASSIC, "Hamburg orchestra", "Symphony", "None",
            "Symphony No. 9", "Baloon Concerto", 1979, 4, 1023, 1822,
            4, "Ludwig van Beethoven")
    hand_covers_bruise = Song(record_genre.SOUNDTRACK, "Trent Reznor and Atticus Ross",
            "Dark ambient", "Trent Reznor and Atticus Ross", "Hand Covers Bruise", "The Social Network",
            2010, 5, 603, 2010, 1, "Trent Reznor and Atticus Ross")
    ham_on_rye = Audiobook(record_genre.POP, "The Kinks", "Charles Bukowski", "Punk", 1956,
            "Ham On Rye", 1995, 7.50, 1305, "Mike Patton", 347, "Ray Davis")
    hlah = Song(record_genre.ROCK, "Nine Inch Nails",
            "Industrial", "Flood", "Head Like a Hole", "Pretty Hate Machine",
            1989, 1, 270, 1988, 1, "Trent Reznor")
    store.records = [ziggy, smooth_criminal, symphony_9, hand_covers_bruise, ham_on_rye, hlah]
    
    #print(store.sort_by_composer    
    store.find_by_recording_possibility()
    store.sort_by_composer()
    print (record_genre.ROCK)
    #print("Press 3 to exit")
    #switch_value = int(input())
    #print(Music_Store.switch(switch_value))
    #print(Music_Store.find_by_recording_possibility)