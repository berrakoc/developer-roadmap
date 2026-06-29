import cv2 as cv

def rescaleFrame(frame, scale= 0.75):
  # Images, Videos and Live Video
  width = int(frame.shape[1] * scale) #width of the image.
  height = int(frame.shape[0] * scale) #height of the image.
  dimensions = (width,height) #new sizes

  return cv.resize(frame, dimensions, interpolation=cv.INTER_AREA)

#frame: the image or video frame you want to resize.
  #scale: how much you want to resize (default is 0.75 = make it 75% of original size).
  #cv.INTER_AREA helps keep the image clear when making it smaller


def changeRes(width,height):
    # Live video
    capture.set(3,width) #3 is actually CAP_PROP_FRAME_WIDTH
    capture.set(4,height) #CAP_PROP_FRAME_HEIGHT
#capture = cv.VideoCapture(0)  # open webcam
#changeRes(640, 480)  


#reading photos
img = cv.imread('Resources/Photos/cat.jpg')
cv.imshow('Cat', img)
resized = rescaleFrame(img)
cv.imshow('Resized', resized)
cv.waitKey(0)



# Reading Videos
capture = cv.VideoCapture('Resources/Videos/dog.mp4')
while True:
  isTrue, frame = capture.read()
  frame_resized = rescaleFrame(frame, scale=.2)
  if isTrue:
    cv.imshow('Video', frame)
    cv.imshow('Video Resized', frame_resized)
    if cv.waitKey(20) & 0xFF==ord('d'): # if you press 'd'
      break
  else: # this way if it cant find any frame it wont give an error message
    break

capture.release()
cv.destroyAllWindows()
