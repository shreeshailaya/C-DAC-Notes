ch = input('Enter char')
if ord(ch)>=65 and ord(ch)<=90:
	print("The character", ch, "  is an uppercase letter")
elif ord(ch)>=97 and ord(ch)<=122:
	print("The character", ch, "  is a lowercase letter")
elif ord(ch)>=48 and ord(ch)<=57:
	print("The character", ch, "  is a digit")
else:
	print("The character", ch, "  is a special chacracter")