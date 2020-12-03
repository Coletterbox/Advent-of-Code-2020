def convert_input(filepath):
    with open(filepath) as f:
        lines = f.read().splitlines()    
    inputAsArray = []
    for line in lines:
        inputAsArray.append(line)
    return inputAsArray

def count_trees(filepath, x, y):
    inputAsArray = convert_input(filepath)
    treeCount = 0
    startX = 0
    startY = 0
    while startY < len(inputAsArray):
        currentRow = inputAsArray[startY]
        currentPosition = currentRow[startX]
        if currentPosition == '#':
            treeCount+=1
        startX+=x
        width = len(inputAsArray[0])
        if startX >= width:
            startX-=width
        startY+=y
    return treeCount

count_trees('Day3ExampleInput.txt', 3, 1)