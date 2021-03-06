import React, { Component } from 'react';
import SplashContainer from './container/splashsreencontainer';
import LoginContainer from './container/logincontainer';
import {StackNavigator, DrawerNavigator} from 'react-navigation';
import ListUsersContainer from './container/ListUserscontainer';
import CustomDrawNav from './container/CustomDrawNav';
import InfoDetailUser from './container/infoDetailUserscontainer';

var navigationOptions = {
    navigationOptions:{
            header:null
    },
    contentComponent: props => (<CustomDrawNav {...props}/>)
}
const Draw = DrawerNavigator({
    Src1: {
        screen: ListUsersContainer,
    }
}, navigationOptions);

 const Stack = StackNavigator({
     SplashContainer : {
         screen: SplashContainer,
     },
     LoginContainer: {
         screen: LoginContainer,
     },
     ListUsersContainer: {
         screen: Draw,
     },
      CustomDrawNav: {
         screen: CustomDrawNav
     },
     InfoDetailUser: {
         screen: InfoDetailUser
     }

},
{
    initialRouteName: 'SplashContainer',
    navigationOptions:{//lol
        header:null
    }
// um do de   headerMode: 'none'

}
);

export default Stack;