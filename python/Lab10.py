class Pen:

	total_value=0
	
	def __init__(self, type = 'Ballpoint', model = 'unknown', color = 'blue', manufacturer = 'Uncle Lao', value = 0.25):
		self.type = type
		self.model = model
		self.color = color
		self.manufacturer = manufacturer
		self.value = value
		Pen.total_value += value		
	def to_string(self):
			print('Type: %s \nModel: %s \nColor: %s \nManufacturer: %s \nValue: %s'%(self.type, self.model, self.color, self.manufacturer, self.value))
	def print_sum(self):
			print("Total value of " + self.manufacturer + "'s pens: ", self.value, "$")
	@staticmethod
	def print_static_sum():
			print('Total value: {0} $'.format(Pen.total_value))
		
if __name__ == '__main__':
	pen0 = Pen()
	pen1 = Pen('Fountain', 'Supreme', 'Black', 'Gama', 50)
	pen2 = Pen('Ballpoint', 'K15', 'Blue', 'Schneider ', 3)
	pen3 = Pen('Gel', 'B19', 'Red', 'Okoko ', 1)
	pen4 = Pen('Technical ', 'Rapidograph 2', 'Green', 'Staedtler', 10)

pen0.to_string
print("\n")
pen1.to_string()
print("\n")
pen2.to_string()
print("\n")
pen3.to_string()
print("\n")
pen4.to_string()
print("\n\n")
pen1.print_sum()
pen2.print_sum()
pen3.print_sum()
Pen.print_static_sum()


