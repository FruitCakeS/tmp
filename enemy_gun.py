def distance(x1,y1,x2,y2):
	return ((x1-x2)**2 + (y1-y2)**2)**0.5

print(distance(0,3,4,0))

def enemy_gun(x1,y1,x2,y2):
	if distance(x1,y1,x2,y2) <=10:
		return "machine_gun"
 	else:
		return "sniper_rifle"

print(enemy_gun(0,3,4,0))