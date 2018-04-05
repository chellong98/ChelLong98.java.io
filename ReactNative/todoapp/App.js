import React from 'react';
import {StackNavigator} from 'react-navigation';
import SplashScreenContainer from './src/containers/splashsreenContainer';
import TodosContainer from './src/containers/todoContainer';
import NewTodoContainer from './src/containers/NewTodoContainer';
import EditTodoContainer from './src/containers/EditTodoContainer';
import RealmContainer from './src/containers/RealmContainer';
const App = StackNavigator(
  {
    SplashScreenContainer : {
      screen: SplashScreenContainer
    },
    TodosContainer: {
      screen: TodosContainer,
    },
    NewTodoContainer: {
      screen: NewTodoContainer
    },
    EditTodoContainer: {
      screen: EditTodoContainer
    },
    RealmContainer: {
      screen : RealmContainer
    }
  },
  {
    initialRouteName: "SplashScreenContainer",
    headerMode: "none",
  }
)

export default App;