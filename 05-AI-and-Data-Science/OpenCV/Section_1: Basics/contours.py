import cv2 as cv
import numpy as np

img = cv.imread('Resources/Photos/cats.jpg')
cv.imshow('Cats', img)

blank = np.zeros(img.shape, dtype='uint8')
cv.imshow('Blank', blank)

gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
cv.imshow('Gray', gray)

blur = cv.GaussianBlur(gray, (5,5), cv.BORDER_DEFAULT)
cv.imshow('Blur', blur)

canny = cv.Canny(blur, 125, 175)
cv.imshow('Canny Edges', canny)

# ret, thresh = cv.threshold(gray, 125, 255, cv.THRESH_BINARY)
# cv.imshow('Thresh', thresh)
#binarizng the image
#this has disadvantages use canny

contours, hierarchies = cv.findContours(canny, cv.RETR_LIST, cv.CHAIN_APPROX_SIMPLE)
print(f'{len(contours)} contour(s) found!') #2794 contour(s) found! at first then 380

cv.drawContours(blank, contours, -1, (0,0,255), 1)
cv.imshow('countours drawn', blank)


cv.waitKey(0)



'''
findCountour: Nesne algılama, Şekil tanıma, Alan, çevre, merkez gibi ölçümler, Görüntüdeki nesne sayısını bulma
------
contours, hierarchy = cv.findContours(image, mode, method[, offset])
image: genelde canny
mode: Görüntüde hangi konturların bulunacağını belirler.
cv.RETR_EXTERNAL	Sadece en dıştaki konturları bulur
cv.RETR_LIST	Tüm konturları bulur (iç içe bakmaz)
cv.RETR_TREE	Tüm konturları hiyerarşik yapı ile döner
cv.RETR_CCOMP	İki seviyeli hiyerarşi döner (dış ve iç konturlar)

method:Kontur noktalarının nasıl temsil edileceğini belirler.
cv.CHAIN_APPROX_NONE	Her pikseli alır (detaylı ama fazla veri)
cv.CHAIN_APPROX_SIMPLE	Gereksiz noktaları atar (sadeleştirilmiş kontur), makes most sense
cv.CHAIN_APPROX_TC89_L1	Teorik yaklaşımlı çizim (ileri seviye)
cv.CHAIN_APPROX_TC89_KCOS	Diğer alternatif teorik yaklaşım

'''