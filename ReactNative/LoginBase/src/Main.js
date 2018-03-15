import React from 'react';
import {StackNavigator} from 'react-navigation';
import {Root} from 'native-base';
import HomeContainer from './container/HomeContainer';
import LoginContainer from './container/LoginContainer';

const Main = StackNavigator(
    {
        HomeContainer: {
            screen: HomeContainer
        },
        LoginContainer: {
            screen: LoginContainer
        }
    },
    {
        initialRouteName: "HomeContainer",
        headerMode: "none",
    }
)

export default Main;
