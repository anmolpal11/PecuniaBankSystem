import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllloanComponent } from './allloan.component';

describe('AllloanComponent', () => {
  let component: AllloanComponent;
  let fixture: ComponentFixture<AllloanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllloanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllloanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
