'use strict';

const chai   = require('chai');
chai.use(require('chai-as-promised'));
chai.should();
const expect = chai.expect;

require('./lib/test-helper');

const until = protractor.ExpectedConditions;

describe('App', function() {

  it('should bring up components on load', function() {
    browser.get(`http://localhost:${process.env.PORT}`);
    browser.wait(until.titleContains('JS Complexity'), 500);
    browser.wait(until.presenceOf(browser.element(by.id('js-complexity-app'))), 500);
  });

});

