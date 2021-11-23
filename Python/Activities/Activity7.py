numbers = list(input("Enter a sequence of comma separated values: ").split(","))
sum = 0
for num in numbers:
  sum += int(num)

print(sum)