import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowloanComponent } from './showloan.component';

describe('ShowloanComponent', () => {
  let component: ShowloanComponent;
  let fixture: ComponentFixture<ShowloanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowloanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowloanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
