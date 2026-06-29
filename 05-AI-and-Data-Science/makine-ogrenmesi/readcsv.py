# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

data = pd.read_csv('eksikveriler.csv')
data

#preprocessing
height = data[['boy']]
print(height)

heightWeight = data[['boy','kilo']]
print(heightWeight)


#numeric verilerin impute edilmesi
from sklearn.impute import SimpleImputer

imputer = SimpleImputer(missing_values=np.nan, strategy='mean')

#.values makes ndarrays
#new versions uses .to_numpy instead of .values
numbers = data.iloc[:, 1:4].to_numpy()
numbers

#fit learns the means, imputer artık ort.ları biliyor
imputer = imputer.fit(numbers[:,1:4])
#fit learns, transform applys
numbers[:,1:4] = imputer.transform(numbers[:,1:4])
numbers

country = data.iloc[:, 0:1].to_numpy()
country

from sklearn import preprocessing

le = preprocessing.LabelEncoder()

country[:,0] = le.fit_transform(data.iloc[:,0])

country

#OneHotEncoder, kategorik verilerin sıralama hatası 
#olmadan modele doğru şekilde aktarılmasını sağlar.
ohe = preprocessing.OneHotEncoder()
country = ohe.fit_transform(country).toarray()
country
data

#dataframe'leri birleştirme

print(list(range(22)))
result = pd.DataFrame(data=country, index = range(22), columns = ['fr', 'tr', 'us'])
result

result2 = pd.DataFrame(data = numbers, index = range(22), columns = ['height','weight','age'])
result2

gender= data.iloc[:,-1].values #to_numpy
print(gender)

result3 = pd.DataFrame(data = gender, index = range(22), columns = ['cinsiyet'])
result3

s = pd.concat([result, result2]) #this adds vertically
s

s = pd.concat([result, result2], axis = 1)
s

s2 = pd.concat([s, result3], axis = 1)
s2


#dataframe'leri ayırma

from sklearn.model_selection import train_test_split

x_train, x_test, y_train, y_test = train_test_split(s2, result3, test_size = 0.33, random_state = 0)

#öznitelik ölçeklendirme

sc = StandardScaler()

X_train = sc.fit_transform(x_train)   # train’den öğren
X_test = sc.transform(x_test)         # test’i aynı ölçekte dönüştür

#Kritik nokta: Test seti asla ayrı normalize edilmez → eğitim setinin bilgisiyle dönüştürülür.





















