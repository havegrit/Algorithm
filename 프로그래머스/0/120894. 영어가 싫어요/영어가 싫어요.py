def solution(numbers):
    dic = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for num, engNum in enumerate(dic):
        numbers = numbers.replace(engNum, str(num))

    return int(numbers)