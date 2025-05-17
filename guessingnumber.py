import random
randomguess=random.randint(1,10); """ramdom integers from 1 to 10"""
def randomnum():
    attempts=0;'''attempts initialize to 0'''
    while True:
        if attempts>=5:
            print("Sorry!! You have used your maximum number of attempts:(");'''prints this if the max number of attempts exceeded'''
            break
        usernum=int(input("input a randomnum: "))
        attempts+=1;'''counts the number of attempts'''
        if randomguess==usernum:
            print("You got it right!!")
            break
        elif randomguess<usernum:
            print("The number guessed is more than the random number")
        else : 
            print("The number guessed is less than the random number")

    print("You have attempted the quiz "+str(attempts)+ " times!");'''Prints the number of times the quiz attempted by the user'''

randomnum()

    