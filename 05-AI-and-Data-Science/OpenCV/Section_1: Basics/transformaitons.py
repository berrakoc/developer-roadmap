import cv2 as cv
import numpy as np

img = cv.imread('Resources/Photos/park.jpg')
print(img.shape[:2]) #(427, 640)
cv.imshow('Park', img)

#translation
def translate (img,x,y):
  transMat = np.float32([[1,0,x],[0,1,y]]) #how much translate, create a matrix
  dimensions = (img.shape[1], img.shape[0]) #same size as before
  return cv.warpAffine(img, transMat, dimensions)

# -x --> Left
# -y --> Up
# x --> Right
# y --> Down

translated = translate(img, -100, 100)
cv.imshow('Translated', translated)

#rotation
def rotate (img,angle,rotPoint=None):
  (height, width) =  img.shape[:2] #attention!! sıralama farklı

  if rotPoint is None:
    rotPoint = (width//2, height//2) #set as center rotation

  rotMat = cv.getRotationMatrix2D(rotPoint, angle, 1.0)
  dimensions= (width,height)
  return cv.warpAffine(img, rotMat, dimensions)

rotated = rotate(img, -90 )
cv.imshow('Rotated', rotated)

#resizing
resized = cv.resize(img, (500,500), cv.INTER_CUBIC)
cv.imshow('Resized', resized)

#flipping
flip = cv.flip(img, -1)
cv.imshow('Flip', flip)

#cropping
cropped = img[200:400, 300:400]
cv.imshow('Cropped', cropped)




cv.waitKey(0)
'''
np.float32([...]) >>> 32-bit ondalıklı matris oluştur

output = cv.warpAffine(src, M, dsize)
M: 2x3 Affine dönüşüm matrisi (örnek: cv.getRotationMatrix2D(...))
dsize: Çıktı görüntüsünün boyutu: (genişlik, yükseklik)

M = cv.getRotationMatrix2D(center, angle, scale)
scale: ne kadar büyütüleceği

resized = cv.resize(src, dsize, interpolation)
interpolation: Piksel hesaplama yöntemi (örn: cv.INTER_LINEAR, cv.INTER_AREA)


flipped = cv.flip(src, flipCode)
flipCode: eksenler 0,1,-1
'''