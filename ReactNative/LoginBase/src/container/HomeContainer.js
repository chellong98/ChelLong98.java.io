import React, { Component } from 'react';
import Home from './../screens/Home';
import MoviesService from './../services/MoviesService';
export interface Props {
    navigation: any,
}
export interface State {

}
const URL_API = 'https://facebook.github.io/react-native/movies.json';
export default class HomeContainer extends Component<Props, State> {
    constructor(props) {
        super(props);
        this.state = {
            list : []
        }
    }
    back() {
        this.props.navigation.navigate('LoginContainer');
    }
    getRequest() {
        // Alert.alert('hello');
        this.service = new MoviesService();
        this.service.getAll(result => {
            this.setState({
                list: result
            })
        })
    }
    componentDidMount () {
        this.getRequest();
    }
  render() {
    return (
        <Home navigation={this.props.navigation} data={this.state.list} back={()=>this.back()}/>
    )
  }
};
