# A simple approach is to do a linear search, i.e  

# Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
# If x matches with an element, return the index.

# Enter the list 
a = list(map(int, input("Enter List ").split()))

# Enter number to be searched 
b = int(input("Enter Number to be Searched "))

# Taking position variable
index = 1

# Linear Searching
for i in a:
    if i != b:
        index += 1
    elif i == b:
        print("Element",b,"is present at position",index)
    else:
        print("Element is not present")
        
# Thank you
