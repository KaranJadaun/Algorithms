class Sorting:

    def selection(self):
        arr = list(map(int, input("Enter array elements : ").split()))
        for i in range(len(arr)):
            mini = i
            for j in range(i,len(arr)):
                if (arr[mini]>arr[j]):
                    mini = j
            arr[mini],arr[i] = arr[i],arr[mini]
        return arr

    def bubble(self):
        arr = list(map(int, input("Enter array elements : ").split()))
        for i in range(len(arr)):
            for j in range(0,len(arr)-i-1):
                if (arr[j]>arr[j+1]):
                    arr[j],arr[j+1] = arr[j+1],arr[j]
        return arr
    
    def insertion(self):
        arr = list(map(int, input("Enter array elements : ").split()))
        for i in range(1,len(arr)):
            key = arr[i]
            j = i-1
            while (j>=0 and key<arr[j]):
                arr[j+1] = arr[j]
                j -= 1
            arr[j+1] = key
        return arr

    def mergesort(arr):
        if (len(arr) > 1):
            mid = len(arr)//2
            l = arr[:mid]
            r = arr[mid:]
            s = Sorting()
            s.mergesort(l)
            s.mergesort(r)
            i = j = k = 0
            while (i<len(l) and j<len(r)):
                if (l[i] < r[j]):
                    arr[k] = l[i]
                    i += 1
                else:
                    arr[k] = r[j]
                    j += 1
                k += 1
            while (i<len(l)):
                arr[k] = l[i]
                i += 1
                k += 1
            while (j<len(r)):
                arr[k] = r[i]
                j += 1
                k += 1
        return arr



sor = Sorting()
while(1):
    print("1.Selection Sort")
    print("2.Bubble Sort")
    print("3.Insertion Sort")
    print("4.Merge Sort")
    print("100.Quit")
    op = int(input("Enter Operation : "))
    if (op == 1):
        print(sor.selection())
    elif (op == 2):
        print(sor.bubble())
    elif (op == 3):
        print(sor.insertion())
    elif (op == 4):
        arr = list(map(int, input("Enter array elements : ").split()))
        print(sor.mergesort(arr))
    elif (op == 100):
        break
