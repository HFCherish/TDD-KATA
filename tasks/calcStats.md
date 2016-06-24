#Calc Stats:

Your task is to process a sequence of integer numbers
to determine the following statistics:

    o) minimum value
    o) maximum value
    o) number of elements in the sequence
    o) average value

For example: [6, 9, 15, -2, 92, 11]

    o) minimum value = -2
    o) maximum value = 92
    o) number of elements in the sequence = 6
    o) average value = 18.166666
    
#Tasks

	1. get statistics for one number
		* input [1], return 1,1,1,1
	2. get statistics for two numbers
		* input [2, -1], return -1, 2, 2, 0.5
		* input [1, 1], return 1, 1, 2, 1
	3. get statistics for any sequence of integer numbers
		* input [6,9,15,-2, 92, 11], return -2, 92, 6, 21.833333
