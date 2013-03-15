McKinseyCo
==========

Developer Intern Exercise
Code Challenge

TASK: Create an app that will be executed in terminal or from the command line. The app should accept a hashtag as an argument and should only print out unique urls found in the 100 most recent tweets that matched the hashtag.
  - I have uploaded Tweetin.java as a solution to this problem.
  - My program takes in a word as a command line argument (which is read as a twitter hashtag) and finds through the  100 most recent tweets that had that hashtag as a part of the tweet. It then searches through those 100 tweets and finds the ones that include URLs as part of the tweet. I use basic substrings to find portion of the file that contains the display URL then print out the URL that follows the identifier.
  - I have included the file sample output for tweetin, which shows what results I obtained when I compiled and ran my code with the hashtag "hat" as my command line argument. 

TASK: Given an array of integers, write some code to find all the integers that appear more than once in the array, sorted by which appears most often to least often (once)
  - I have uploaded intRepeats.java as a solution to this problem.
  - My program takes the array of random, unsorted integers I provided in my main method, and uses two ArrayLists I created to sort the array in order of frequency. I first sort the array in ascending order, and then proceed to run through the sorted array, counting the duplicates in a row and adding the amount of duplicates to ArrayList freq, and the number whose duplicates are being counted to ArrayList number. I then sort the ArrayLists by which appears most often to least often by sorting freq in descending order, and as freq is changing, also changing the corresponding values in ArrayList number. I then simply print out the values of ArrayList number for each of their frequencies using a nested for loop. 
  - I have included the file sample output for intRepeats, which shows what happened when I compiled and ran my code.

