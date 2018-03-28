import React, { Component } from 'react';
import Service from './Service';
import Setting from './../utils/setting';
export default class MoviesService extends Service {
  getAll(callback) {
      this.http.get(Setting.URL_GETBOOKING, this.header)
      .then(response => response.json())
      .then(responseData => callback(responseData.DATA))
  }
};