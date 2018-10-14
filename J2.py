n=input()
x=input()
y=input()
n=int(n)

list_yesterday=list(x)
list_today=list(y)




space=0
for i in range(0,n):
	if list_today[i]==list_yesterday[i] and list_today[i]!=".":
		space +=1

print (space)