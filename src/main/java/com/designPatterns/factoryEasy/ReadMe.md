## Factory method is nothing but object on demand

Lets assume there is shape interface.

circle, triangle, square implemented the common interface

they implemented common interface because we don't know what kind of object that client needs

then we will craete a shape factory which will know what object client want and it will then provide