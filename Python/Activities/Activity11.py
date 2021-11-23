fruits = {
    "apple" : 250,
    "mango" : 150,
    "pomo"  : 200,
    "papaya": 100
}
key_to_check = input("What are you looking for? ")
 
if(key_to_check in fruits):
    print("Yes, this is available")
else:
    print("No, this is not available")