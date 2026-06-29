import cv2 as cv
import numpy as np

blank = np.zeros((500, 500,3), dtype='uint8') #img type, 3 color channels BGR
cv.imshow('Blank', blank)

# 1. Paint the image a certain colour
blank[200:300, 300:400] = 0,0,255
cv.imshow('Green',blank)

# 2. Draw a Rectangle
#cv.rectangle(img, start_point, end_point, color, thickness)
#cv.rectangle(blank, (0,0), (250,500), (0,250,0), thickness=-1)
cv.rectangle(blank, (0,0), (blank.shape[1]//2, blank.shape[0]//2), (0,250,0), thickness=-1) 
cv.imshow('Rectangle', blank)

# 3. Draw A circle
#cv.circle(img, center, radius, color, thickness)
cv.circle(blank, (blank.shape[1]//2, blank.shape[0]//2), 70, (0,0,255), thickness=2)
cv.imshow('Circle', blank)

# 4. Draw a line
#cv.line(img, pt1, pt2, color, thickness)
cv.line(blank, (blank.shape[1]//2,0), (blank.shape[1]//2, blank.shape[0]//2), (255,255,255), thickness=2)
cv.imshow('Line', blank)

# 5. Write text
#cv.putText(img, text, org, font, fontScale, color, thickness, lineType)
cv.putText(blank, 'focus novac!!', (0,30), cv.FONT_HERSHEY_SIMPLEX, 1.0, (255, 0, 0), 2)
cv.imshow('Text', blank)



cv.waitKey(0)

#thickness=-1 fills in
#blank.shape[1]//2 width / 2 means center