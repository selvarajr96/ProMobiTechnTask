# Android MVVM Based Architectural Components

 This project used in most popular API

 Reference :

 NYTimes most popular API : https://developer.nytimes.com/docs/most-popular-product/1/overview
 Api : https://api.nytimes.com/svc/mostpopular/v2/emailed/7.json?api-key=yourkey

The application has been built with **offline support**. It has been designed using **Android Architecture components** with **Room** for offline data caching. The application is built in such a way that whenvever there is a service call, the result will be stored in local database.

The whole application is built based on the MVVM architectural pattern.
The main advatage of using MVVM, there is no two way dependency between ViewModel and Model unlike MVP. Here the view can observe the datachanges in the viewmodel as we are using LiveData which is lifecycle aware. The viewmodel to view communication is achieved through observer pattern (basically observing the state changes of the data in the viewmodel).

# Below libaries are used

a) Android Architectural Components <br/>
b) Dagger 2 for Dependency Injection <br/>
c) Retrofit with Okhttp for Network calls<br/>
d) Glides for Image Loading<br/>
e) MVVM <br/>
f) ViewModel <br/>
g) LiveData <br/>
h) ROOM for data caching <br/>
i) Data binding <br/>
j) RxJava,RXAndroid for database operation(scheduler) <br/>
K) JUnit and Mockito for Unit testing <br/>

