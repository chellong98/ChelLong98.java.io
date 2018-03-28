import React from 'react';
import {StackNavigator} from 'react-navigation';
import {Root} from 'native-base';
import HomeContainer from './container/HomeContainer';
import LoginContainer from './container/LoginContainer';
import DialogConfirmBookingController from './container/DialogConfirmBookingController';
import DoctorActiveManagerController from './container/DoctorActiveManagerController';
import HistoryBookingController from './container/HistoryBookingController';
const Main = StackNavigator(
    {
        HomeContainer: {
            screen: HomeContainer
        },
        LoginContainer: {
            screen: LoginContainer
        },
        DialogConfirmBookingController: {
            screen: DialogConfirmBookingController
        },
        DoctorActiveManagerController: {
            screen: DoctorActiveManagerController,
        }, 
        HistoryBookingController: {
            screen: HistoryBookingController,
        }
    },
    {
        initialRouteName: "HistoryBookingController",
        headerMode: "none",
    }
)

export default Main;
