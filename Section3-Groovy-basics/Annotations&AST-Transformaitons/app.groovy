// testing out our customer class

def d = new Date()
def c1 = new Customer(first:'Bob', last:'Morton', age:21,since:d, favItems:['Books','Guns'])
def c2 = new Customer('Bob', 'Morton', 21, d, favItems:['Books','Guns'])
assert c1 == c2