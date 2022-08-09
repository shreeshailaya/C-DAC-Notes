import time

def myDecorator(fun):
    def inner():
        start_time = int(round(time.time() * 1000))
        fun()
        end_time = int(round(time.time() * 1000))

        time_taken = end_time - start_time

        return str(time_taken)+' ms'
    return inner


@myDecorator
def sleepFunctionOne():
    time.sleep(1.1)

@myDecorator
def sleepFunctionTwo():
    time.sleep(1.2)

@myDecorator
def sleepFunctionThree():
    time.sleep(1.3)

print('Function One took => '+sleepFunctionOne())
print('Function Two took => '+sleepFunctionTwo())
print('Function Three took => '+sleepFunctionThree())