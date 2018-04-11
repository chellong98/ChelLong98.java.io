 import SplashContainer from './container/splashsreencontainer';
 import LoginContainer from './container/logincontainer';
import {StackNavigator} from 'react-navigation';
import ListUsersContainer from './container/ListUserscontainer';
 const Stack = StackNavigator({
     SplashContainer : {
         screen: SplashContainer,
     },
     LoginContainer: {
         screen: LoginContainer,
     },
     ListUsersContainer: {
         screen: ListUsersContainer,
     }
},
{
    initialRouteName: 'ListUsersContainer',
    headerMode: 'none'
}
);

export default Stack;