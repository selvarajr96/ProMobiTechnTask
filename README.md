# Android MVVM Based Architectural Components

The application has been built with **offline support**. It has been designed using **Android Architecture components** with **Room** for offline data caching. The application is built in such a way that whenvever there is a service call, the result will be stored in local database.

The whole application is built based on the MVVM architectural pattern.
The main advatage of using MVVM, there is no two way dependency between ViewModel and Model unlike MVP. Here the view can observe the datachanges in the viewmodel as we are using LiveData which is lifecycle aware. The viewmodel to view communication is achieved through observer pattern (basically observing the state changes of the data in the viewmodel).

# Programming Practices Followed
a) Android Architectural Components <br/>
b) Dagger 2 for Dependency Injection <br/>
c) Retrofit with Okhttp for Network calls<br/>
d) Glides for Image Loading<br/>
e) MVVM <br/>
f) ViewModel <br/>
g) LiveData <br/>
h) ROOM for data caching <br/>
j) Data binding <br/>
H) RxJava,RXAndroid for database operation(scheduler) <br/>
i) JUnit and Mockito for Unit testing <br/>

