import cv2 as cv

# read image
img = cv.imread('Resources/Photos/park.jpg')
cv.imshow('Park', img)

#convert to gray scale
gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
cv.imshow('Gray', gray)

#blur
#blur = cv.GaussianBlur(src, ksize, borderType)
#ksize needs to be ODD number
blur = cv.GaussianBlur(img, (7,7), cv.BORDER_DEFAULT)
cv.imshow('Blur', blur)


# Edge Cascade
'''
#edges = cv.Canny(image, threshold1, threshold2)
(125’ten düşük olanlar yok sayılır)
(175’ten yüksek olanlar kenar kabul edilir)
if you wanna reduce some edges send blur as a param
'''
canny = cv.Canny(img , 20, 50)
cv.imshow('Canny Edges', canny)

#dilate the image
'''
canny >>> Giriş görüntüsü (kenarlar bulunmuş bir görüntü, genellikle siyah-beyaz)
(7, 7)	Kernel boyutu >>> 7x7'lik yapı elemanı ile genişletme yapılır
iterations=3	İşlemi 3 kez tekrar et; daha kalın sonuçlar elde edilir
İnce kenar → kalın kenar, Kenarlar birbirine daha çok yaklaşır, Gürültü artabilir ama boşluklar da kapanabilir
'''
dilated = cv.dilate(canny, (7,7), iterations=3)
cv.imshow('Dilated', dilated)

# Eroding
'''kinda inverse of dilate'''
eroded = cv.erode(dilated, (7,7), iterations=3)
cv.imshow('Eroded', eroded)

# Resize
'''there are a lot of interpolation types; slower, faster, high-low quality'''
resized = cv.resize(img, (500,500), interpolation=cv.INTER_LANCZOS4)
cv.imshow('Resized', resized)

# Cropping
cropped = img [50:200, 200:400] #y(height), x(width)
cv.imshow('Cropped', cropped)


cv.waitKey(0)


#griye çevirme: Kenar tespiti, eşikleme gibi işlemler genellikle gri resim ister.
#blurlama: Gürültüyü azaltmak ve daha düzgün kenar bulmak için kullanılır.
#canny edge detection
#dilation: daha kalın kenarlar ve küçük boşlukları kapatmak için
#erosion: kenarları inceltmek ve gürültüleri temizlemek