def calculate_sum(numbers):
    sum = 0
    for num in numbers:
        sum = sum + int(num)
    return sum
    
numbers = list(input("Enter comma separated values:").split(","))
result = calculate_sum(numbers)
print("The sum of all the elements is: " + str(result))
