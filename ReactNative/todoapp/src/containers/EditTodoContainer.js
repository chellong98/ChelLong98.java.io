import React, { Component } from 'react';
import EditTodoScreen from './../screens/EditTodoscreen';
export interface Props {
    navigation: any,
    setValue: Function,
}
export default class edittodocontainer extends Component {
    
    constructor(props) {
        super(props);
        this.state = {
            year: "",
            time: "", 
        }
    }

   
    
  render() {
    const {params} = this.props.navigation.state;
    var year = params.year.slice(4,params.year.length) + ",2018";
    var hour = params.hour<13 ? params.hour : params.hour-12;
    var minute = params.minute<10 ? 0+""+params.minute : params.minute; 
    var time = hour + ":" + minute + " PM";
    var text = params.text;
    console.log(year + " | " + time);
    console.log(params.minute);
    // this.setState({year,time});
    return (
      <EditTodoScreen navigation={this.props.navigation} year={year} time={time} text={text}/>
    )
  }
};
