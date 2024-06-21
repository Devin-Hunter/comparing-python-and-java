# Testing python shit

def doublename(string1, string2):
    return fullname(string1, string2) + " " + fullname(string1, string2)

def fullname(string1, string2):
    return string1 + " " + string2

firstname = "Devin"
lastname = "Matherne"

print(doublename(firstname, lastname))
