
terms = 16  

a, b = 0, 1
count = 0

print(f"Fibonacci sequence up to {terms} terms:")

while count < terms:
    print(a, end=" ")
    a, b = b, a + b
    count += 1
