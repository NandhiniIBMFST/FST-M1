numbers = list(input("Enter comma separated numbers:").split(","))

# Get first element in list
firstElement = numbers[0]
# Get last element in list
lastElement = numbers[-1]

if firstElement==lastElement:
    print(True)
else:
    print(False)
