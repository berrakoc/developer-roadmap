import cv2 as cv

#reading images
'''
img = cv.imread('Resources/Photos/cat_large.jpg')
cv.imshow('Cat',img)
cv.waitKey(0)
'''

#reading videos
#capture = cv.VideoCapture(0) # 0=webcam 1= first cam 2=other cams
capture = cv.VideoCapture('Resources/Videos/dog.mp4')
while True:
  isTrue, frame = capture.read()
  if isTrue:
    cv.imshow('Video', frame)
    if cv.waitKey(20) & 0xFF==ord('d'): # if you press 'd'
      break
  else: # this way if it cant find any frame it wont give an error message
    break

capture.release()
cv.destroyAllWindows()
