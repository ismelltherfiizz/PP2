import re

quantity = 0
result = []

pattern = r'17May2015\([0-1][1-9])|([2][0-1]).\GET presentations'

with open(r'C:\Users\Mykhailo\Documents\Git repos\PP2\python\logs') as text:
    text = text.readlines()
    for line in text:
        found = re.search(pattern, line)
        if found is not None:
            quantity += 1
        

    

print(quantity)