import {browser} from "protractor";

export class Angular2Page {
  navigateTo() {
    return browser.get('/');
  }
}
