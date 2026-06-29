import csv

#print second column on each row
"""
with open("cs50/favorites.csv", "r") as file:
  reader = csv.reader(file)
  next(reader) #pass the first row cuz they are headings
  for row in reader:
    print(row[1]) #print second column on each row"""

#print each rows language value
"""with open("cs50/favorites.csv", "r") as file:
  reader=csv.DictReader(file) #use dictionary for reading- it takes the first row as key value
  for row in reader:
    print(row["language"]) #print each rows language value"""

#we aim to list languages w their counts
"""
with open("cs50/favorites.csv", "r") as file:
  reader=csv.DictReader(file)
  counts= {}

  for row in reader:
    fav=row["language"] #this changes in each iteration
    if fav in counts:
      counts[fav]+=1 
    else:
      counts[fav]=1

for language in counts:
  print(f"{language}: {counts[language]}") #be aware of what youre doing. neyden kaç tane var onu printliyoruz

"""

"""with open("cs50/favorites.csv", "r") as file:
  reader=csv.DictReader(file)
  counts= {}
  for row in reader:
    fav=row["language"] #this changes in each iteration
    if fav in counts:
      counts[fav]+=1 
    else:
      counts[fav]=1

  #for language in sorted(counts): #alfabetik sıra
  #for language in sorted(counts, key=counts.get): #artan sayıya göre sorted
  for language in sorted(counts, key=counts.get, reverse=True): #azalan sayıya göre
    print(f"{language}: {counts[language]}")"""

#counter classı hali hazırda var ve içinde bazı funclar var
"""from collections import Counter
with open("cs50/favorites.csv", "r") as file:
  reader=csv.DictReader(file)
  counts= Counter() #dictionaryi hazır alıyorum

  for row in reader:
    fav= row["language"]
    counts[fav]+=1

for language in sorted(counts, key=counts.get, reverse=True):
    print(f"{language}: {counts[language]}")"""


#her şeyi değil de spesific bilgileri printlemek istiyoruz
from collections import Counter
with open("cs50/favorites.csv", "r") as file:
  reader=csv.DictReader(file)
  counts= Counter() #dictionaryi hazır alıyorum

  for row in reader:
    fav= row["language"]
    counts[fav]+=1

fav=input("Favorite: ") #which language would you like to learn
print(f"{fav}: {counts[fav]}")





